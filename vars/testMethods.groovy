def test() {
  sh 'echo "This is a test!"'
  sh 'sudo apt-get install jq -y'
  sh 'echo "End"'
}
