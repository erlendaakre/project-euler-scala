// finds the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
Stream.from(20, 20).collectFirst { case i if !((3 to 19).reverse exists (i % _ != 0)) => i }.get