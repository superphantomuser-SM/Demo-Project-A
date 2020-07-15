'''
Demo Project A
Made by Jack Donofrio
11:51 PM July 14 2020
'''

# returns sum of a and b
def addition(a, b):
    return 0

# returns difference of a and b
def subtraction(a, b):
    return 0

# returns product of a and b
def multiplication(a, b):
    return 0

# returns a divided by b
def division(a, b):
    # Think about what happens when b = 0.
    # How might you handle that?
    return 0

# returns a divided by b, with any decimals cut off
def integer_division(a, b):
    return 0


# returns a to power of b
def exponent(a, b):
    return 0


## Tests ##

def addition_test():
    assert(addition(1, 2) == 3)
    assert(addition(5,2) == 7)
    assert(addition(3.5, 4.5) == 8.0)

def subtraction_test():
    assert(subtraction(100, 10) == 90)
    assert(subtraction(3.14, 1) == 2.14)
    assert(subtraction(5, 10) == -5)

def multiplication_test():
    assert(multiplication(10, 5) == 50)
    assert(multiplication(3, 1.5) == 4.5)
    assert(multiplication(1000, 3) == 3000)

def division_test():
    assert(division(10,2) == 5)
    assert(division(3.0, 1.5) == 2)
    assert(division(100, 10) == 10)

def integer_division_test():
    assert(integer_division(7, 2) == 3)
    assert(integer_division(25, 2) == 12)
    assert(integer_division(3, 2) == 1)

def exponent_test():
    assert(exponent(2,3) == 8)
    assert(exponent(4, 0.5) == 2)
    assert(exponent(8, 1 / 3) == 2)