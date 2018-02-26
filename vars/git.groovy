def call( Map repo) {
  echo "name is ", ${repo.name}
  git url: "https://github.com/AliceCodeZhang/${repo.name}.git"
}

