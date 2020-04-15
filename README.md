This simple spring boot app is packaged as Jar using gradle build tool.
Docker is used to package and run it on a container.
To download this simple webapp, please run the following command
<p>
<code>
docker run -p 8080:8080 sjarvind28/myspringboot-docker
</code>
</p>

This will pull the image from hub.docker.com and runs the app.
It exposes local 8080 port to the container's 8080 port.

If your local machine's 8080 is unavailable then use a different port to bind the container's port.
Ex:
<p>
<code>
docker run -p 8082:8080 sjarvind28/myspringboot-docker
</code>
</p>
where 8082 is your local machines port.
