def string_to_integer(s):
    try:
        return int(s)
    except ValueError:
        return None

# Sample Input
input_string = "1234"

# Convert string to integer
output_integer = string_to_integer(input_string)

# Output
if output_integer is not None:
    print("Output String:", output_integer)
else:
    print("Invalid input. Cannot convert to integer.")
