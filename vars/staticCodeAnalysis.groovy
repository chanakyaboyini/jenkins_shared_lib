def call(credentialsId){
    withSonarQubeEnv(credentialsId: 'Jenkins_Sonar_test_practice') {
        sh 'mvn clean package sonar:sonar'
    }    
}
