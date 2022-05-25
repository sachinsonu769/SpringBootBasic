pipeline{
    agent any

	stages{
	    stage("Code checkout"){
	        steps{
	            git 'https://github.com/sachinsonu769/springbootbasic.git'
	        }
	    }
	    stage('Build'){
	        steps{
	            echo 'maven build..'
	        }
	    }
		stage('test'){
		    steps{
		        echo 'test'
		    }
		}

	}

}
