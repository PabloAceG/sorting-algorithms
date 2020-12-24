from enum import Enum

class Order(Enum):
    ASC  =  1
    DESC = -1

class Pivot(Enum):
    FIRST  = "first"
    LAST   = "last"
    RANDOM = "rand"
    MEDIAN = "med"

class BadOrderError(Exception):
    pass

class BadPivotError(Exception):
    pass

class BadArgumentCombinationError(Exception):
    pass
