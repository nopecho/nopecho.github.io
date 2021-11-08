echo "# example-repo" >> README.md\n
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:outsideris/example-repo.git
git push -u origin main
