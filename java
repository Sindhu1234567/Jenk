pipeline {
        }
        stage('Build') {
            steps {
                dir("/var/lib/jenkins/workspace/New_demo/my-app") {
                dir("/var/lib/jenkins/workspace/New_demo/my-app/") {
                sh 'mvn -B -DskipTests clean package'
                }
