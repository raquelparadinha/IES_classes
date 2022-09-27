package com.raquelparadinha;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.raquelparadinha.ipma_client.IpmaCityForecast; //may need to adapt package name
import com.raquelparadinha.ipma_client.IpmaService;
import com.raquelparadinha.ipma_client.CityForecast;

import java.util.function.DoubleToLongFunction;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    //todo: should generalize for a city passed as argument
    private static int CITY_ID_AVEIRO = 1010500;

    public static void  main(String[] args ) {

        if (args.length != 0) {
            CITY_ID_AVEIRO = Integer.parseInt(args[0]);
        }
        
        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                CityForecast firstDay = forecast.getData().listIterator().next();   

                System.out.printf("\n=========== Meteorology for %s ===========\n" +
                        "Maximum temperature: %4.1fºC\n" +
                        "Minimum temperature: %4.1fºC\n" +
                        "Precipitation probability: %4.1f%%\n" +
                        "Wind direction: %s\n" +
                        "Wind Speed: %d\n",
                        firstDay.getForecastDate(),
                        Double.parseDouble(firstDay.getTMax()),
                        Double.parseDouble(firstDay.getTMin()),
                        Double.parseDouble(firstDay.getPrecipitaProb()),
                        firstDay.getPredWindDir(),
                        firstDay.getClassWindSpeed());

            } else {
                System.out.println( "No results for this request!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
