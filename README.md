# IES_102491

## Notes

When trying to run the MyWeatherRadar program I received a warning about threads. In order to resolve it I used the command

```bash
mvn exec:java -Dexec.mainClass="main.java.com.raquelparadinha.WeatherStarter" -Dexec.cleanupDaemonThreads=false
```

With the parameter `cleanupDaemonThreads` set to `false`, maven does nothing about the daemon threads. When maven has no more work to do, the VM will normally terminate any remaining daemon threads.
