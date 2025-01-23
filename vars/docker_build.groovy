def call(String ProjectName,String ImageTag,String DockerHubUser){
  sh "build -t ${DockerHubUser}/${ProjectName}:${ImageTag}."
}
