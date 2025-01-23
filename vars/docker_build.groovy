def call(String ProjectName,String ImageTag,String dockerHubUser){
  sh "build -t ${dockerHubUser}/${ProjectName}:${ImageTag}."
}
