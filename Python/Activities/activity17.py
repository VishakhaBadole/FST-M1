import pandas
# my_dataframe = pandas.read_csv(r"C:\Users\VishakhaBadole\IdeaProjects\FST_Python\resources\employee.csv")

data={
    "name":["vishakh"],
    "Hire Date":["2/7/2020"],
    "Salary":["65000"],
    "Sick Days remaining":["10"]
}
my_dataframe2=pandas.DataFrame(data)
my_dataframe2.to_csv("C:\\Users\\VishakhaBadole\\IdeaProjects\\FST_Python\\resources\\employee.csv",mode='a+',index=False,header=False)
print("done")
df = pandas.read_csv("/resources/employee.csv")
print(df)
