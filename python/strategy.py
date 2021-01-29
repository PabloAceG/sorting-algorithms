from enum import Enum

__author__ = "Pablo Acereda"
__copyright__ = "Copyright 2020"
__credits__ = [ "Pablo Acereda" ]

__license__ = "Apache License 2.0"
__version__ = "1.0"
__maintainer__ = "Pablo Acereda"
__email__ = "p.aceredag@gmail.com"

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
