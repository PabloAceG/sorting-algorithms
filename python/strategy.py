from enum import Enum

class Order(Enum):
    ASC  =  1
    DESC = -1

class Pivot(Enum):
    FIRST  = "first"
    LAST   = "last"
    RANDOM = "rand"
    MEDIAN = "med"

class CountType(Enum):
    INT   = 1
    CHAR  = 2
    RADIX = 3
