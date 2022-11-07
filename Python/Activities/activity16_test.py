class car:
    def __init__(self,manufacturer,model,make,transamission,color):
     self.manufacturer= manufacturer
     self.model= model
     self.color=color
    def accelerate(self):
        print(self.manufacturer+" "+ self.model +"is moving")
    def stop(self):
        print(self.manufacturer+" "+ self.model +"has stop")

my_car1 = car("bmw","z300",2011,"petrol","indigo")
print("car1 is:", my_car1.manufacturer,my_car1.color)

my_car2 = car("car2 is:""Hundai","i20",2017,"petrol","indigo")

my_car3 = car("Honda","city",2022,"petrol","indigo")
print("car3 is", my_car3.manufacturer)

my_car3.accelerate()
my_car1.stop()

