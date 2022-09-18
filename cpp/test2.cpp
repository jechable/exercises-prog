// Program to display the sum of two numbers.
// The aim of this is getting used to the way C++ can take inputs from the user

#include <iostream>

int main() {
	int a, b, x; // Allocate memory for this variables.
	
	std::cin >> a >> b;

	x = a + b;

	std::cout << "The sum is: " << x << std::endl;

	return 0;

}	
