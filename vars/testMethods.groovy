def test() {
  sh 'echo "This is a test!"'
  sh 'curl --version'
  sh 'echo "End"'
}
