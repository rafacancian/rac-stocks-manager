# RAC Stocks

RAC Stocks is a system created to calculate the best stocks available in the market according to some filters and methods known and consolidated in the financial market.

# Projetc created with multiple repositories

Steps

## 1 Create projects on Github <br />
create rac-stocks <br />
create rac-stocks-frontend <br />
create rac-stocks-manager <br />

## 2 Link projects
git remote set-url frontend https://github.com/rafacancian/rac-stocks-frontend.git <br />
git remote set-url manager https://github.com/rafacancian/rac-stocks-manager.git <br />

## 3 Add repositories to mainly project using SubTree 
subtree add --prefix=rac-stocks-frontend/ frontend main <br />
subtree add --prefix=rac-stocks-manager/ manager main <br />
