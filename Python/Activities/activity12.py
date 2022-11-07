# Write a recursive function to calculate the sum of numbers from 0 to 10

def total(n):
    i=0
    if i==n:
          return n
    else:
          return n+ total(n-1)

num= int(input("enter any number"))
print("sum is",(total(num)))