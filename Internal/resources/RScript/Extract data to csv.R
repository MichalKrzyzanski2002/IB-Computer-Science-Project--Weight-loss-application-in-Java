library(readxl)
X2015_2016_FNDDS_At_A_Glance_FNDDS_Nutrient_Values <- read_excel("2015-2016 FNDDS At A Glance - FNDDS Nutrient Values.xlsx")
View(X2015_2016_FNDDS_At_A_Glance_FNDDS_Nutrient_Values)
x<-X2015_2016_FNDDS_At_A_Glance_FNDDS_Nutrient_Values
signif(x[,2:6],3)
write.table(x,sep = "@","C:\\Users\\micha\\Documents\\NetBeansProjects\\Internal\\src\\ingridients\\dataIngridients.txt",quote = FALSE)
