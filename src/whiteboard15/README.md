# problem domain:
## create a function that cycles through a test and removes data based on where the cycle starts.
# Solution:
## Run through a loop that starts at the the resquested spot in a queue. Then remove test data from the queue until only one piece of data is left.
####
Write a function called EeneyMeeneyMineyMoe() that accepts a list of strings and an int n. Start at the beginning of the list and count up to n and remove the person at the current index from the list. Keep counting from that index and count up to n over and over until only one person is left in the list. Return a string with the name of the last person left in the list.