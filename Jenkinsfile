pipeline
{
    agent 
    {
    label 'Win1'
    }
    tools
    {
    jdk "JAVA_HOME"
    }
    stages
    {
    stage ('CheckOut')
    {
    steps
    {
    checkout([$class: 'GitSCM', branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[credentialsId: 'a65b3bdc-5075-42d3-a05b-06ccc061749a', url: 'https://github.com/rajesh-cts/learningTestNG.git']]])
}
    
}
tage ('Test')
    {
    steps
    {
    bat 'mvn clean install test'
}
    
}
 
 }   

}