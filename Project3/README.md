# Project 3: Rideforce
Rideforce is an application for matching drivers and riders together for carpooling.

# Tech Stack
 + Used __Amazon EC2__ to run and deploy our server-side code.
 + Used __Jenkins__ to create CI/CD pipelines.
 + Used a __Tomcat__ server.
 + Used __Amazon S3__ for storing static websites.
 + Used __Eureka__ to discover our microservices.
 + Used __Slack__ to automatically notify developers how stable the build was after they pulled into 
the dev and master branches.
 + Used __Github__ to store our code and for version control.
 + Have different pipelines for each of the microservices.

Separate Dev and Master pipelines.

# Pipeline Workflow (Configuration Picture included in Repo):
General -> Source Code Management -> Build Triggers -> Build -> Post-build Actions
 + __General__: Only kept a max number of builds here so that old builds would not take up space 
on our t3 micro 8 GB EC2 instance.
 + __Source Code Management__: connected the https://github.com/revaturelabs/rideshare-client.git 
repository here and specified the branch to use.
 + __Build Triggers__: Configured it to GitHub hook trigger for GITScm polling.
 + __Bindings__: Set up secret text bindings for AWS credentials for the backend pipelines here. 
This is not in the frontend pipeline.
 + __Build Environment__: Provided Node and npm bin folder to PATH for the front end. This is not 
in the backend pipeline.
 + __Build__: Included a shell script to be executed when triggered for building, testing, and 
documenting the project.
 + __Post-build Actions__: Published artifacts to S3 Bucket for the frontend here and notified 
developers whether the build succeeded via Slack Notifications.

# Links (Pictures Below)
Associated Github Repos:
https://github.com/revaturelabs?utf8=%E2%9C%93&q=rideshare&type=&language=

Hosted Client-side Test Coverage: 
http://ec2-54-172-152-53.compute-1.amazonaws.com:8080/client-coverage/

Hosted Client-side Documentation:
http://ec2-54-172-152-53.compute-1.amazonaws.com:8080/client-docs/

Hosted Back-end Documentation for Different Services
http://ec2-54-172-152-53.compute-1.amazonaws.com:8080/user-docs/
http://ec2-54-172-152-53.compute-1.amazonaws.com:8080/matching-docs/
http://ec2-54-172-152-53.compute-1.amazonaws.com:8080/maps-docs/

## Jenkins - Master:
![Jenkins - Master](MasterJenkins.jpg)

## Client-side Test Coverage:
![Client-side Test Coverage](ClientTestCoverage.jpg)

## Client-side Documentation:
![Client-side Documentation](ClientDocumentation.jpg)

## Back-end Documentation:
![Back-end Documentation](BackendDocumentation.jpg)
