node {
    def mvnHome = tool 'Maven'
    
    stage("Check Project"){
        checkout scm
    }
    
        
    stage("Start unit test") {
        sh "${mvnHome}/bin/mvn clean test"

    }

    stage("Start integration test") {
        sh "${mvnHome}/bin/mvn test-compile failsafe:integration-test"

    }

stage("Start integration test") {
        sh "${mvnHome}/bin/mvn package"

    }
}

