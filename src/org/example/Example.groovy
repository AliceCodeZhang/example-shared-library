package org.example;

def checkOutFrom(repo) {
  git url: "git@github.com:AliceCodeZhang/${repo}"
}

return this
