# Run instructions
git clone the repo
```bash
git clone git@github.com:vencislavdimitrov/west-fronend.git
```
build it
```bash
gradle build
```

run it
```bash
gradle bootRun
```

MongoDB should be available to the application. The configuration is in 'src/main/resources/application.properties'
The service will be available on localhost:8080