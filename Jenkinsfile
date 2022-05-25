pipeline{
    agent any

	stages{
	    stage("Code checkout"){
	        steps{
	            echo 'code checkout..'
	        }
	    }
	    stage('Build'){
	        steps{
	            echo 'maven build'
	        }
	    }
		stage('test'){
		    steps{
		        echo 'test'
		    }
		}

	}

}
