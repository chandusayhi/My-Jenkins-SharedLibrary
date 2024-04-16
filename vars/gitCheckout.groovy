def checkout (){
  sh ''' 
  rm -rf hello-world-war
  '''
  sh '''
  git clone https://github.com/chandusayhi/hello-world-war.git
  '''
}

