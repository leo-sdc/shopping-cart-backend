# Shopping Cart

## Docker

### Build

Run `./mvnw install dockerfile:build` to create a docker image. The build step execute flyway migrations, run junit tests, make executable jar and build a docker image.

### Run

Run `docker run -p 8080:8080 -t lsc/shopping` to run the docker image.
