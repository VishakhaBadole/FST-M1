import pandas
from pandas import ExcelWriter
data={
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
      }
my_dataframe=pandas.DataFrame(data)



writer = ExcelWriter("/resources/emp2.xlsx")
my_dataframe.to_excel(writer, 'Sheet2', index = False)

# Commit data to the Excel file
writer.save()
