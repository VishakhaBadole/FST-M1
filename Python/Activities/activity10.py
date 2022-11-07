# Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
my_tuple= tuple(input("Enter list numbers separated by,").split(","))

# int(my_tuple)
print(type(my_tuple))

# res = [str(num) for num in my_tuple]
# res_string="".join(res)
for num in my_tuple:
    if int(num) % 5==0:
        print(str(num))
