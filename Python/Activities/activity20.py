import pandas
dataframe = pandas.read_excel("C:\\Users\VishakhaBadole\\IdeaProjects\\FST_Python\\resources\\emp2.xlsx", sheet_name="Sheet2")
print(dataframe)
print("--emails--")
print(dataframe["Email"])
print("col and rows",dataframe.shape)
print("--ordered data--")
print(dataframe.sort_values('FirstName'))