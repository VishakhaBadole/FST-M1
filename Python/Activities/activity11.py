# Create a Python dictionary that contains a bunch of fruits and their prices.
#
# Write a program that checks if a certain fruit is available or not.
my_dict={
    "banana":"40",
    "mango":"180",
    "grapes":"90",
}
my_input=input("enter the fruit you need")
for f in my_dict:
   if my_input==str(f):
        print("here it is:", f, my_dict[f])