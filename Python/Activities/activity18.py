import pandas
# my_dataframe = pandas.read_csv(r"C:\Users\VishakhaBadole\IdeaProjects\FST_Python\resources\employee.csv")

#
# data={
#     "Usernames":["Charles","Deku"],
#     "Passwords":["Charl13","AllMight"],
#       }
# my_dataframe2=pandas.DataFrame(data)
# my_dataframe2.to_csv("C:\\Users\\VishakhaBadole\\IdeaProjects\\FST_Python\\resources\\username.csv",index=False)
# print("done")
df = pandas.read_csv("/resources/username.csv")
print("===============")
print(df["Usernames"])

print("===============")
print(df["Usernames"][3],"|",df["Passwords"][3])


print("===============")
print("Data sorted in ascending Usernames:")
print(df.sort_values("Usernames"))
print("Data sorted in ascending Passwords:")
print(df.sort_values("Passwords", ascending=False))

