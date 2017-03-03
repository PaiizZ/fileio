# FileIO
####by Wanchanapon Thanwaranurak

Big-Alice-in-Wonderland.txt sized 2,101,560 bytes. I ran the tasks on a mac book air , and got these results:

| Tasks                                               | Time          |
| --------------------------------------------------- |:-------------:|
| Copy a file by byte to byte at a time.              | 5.524966 sec  |
| Copy a file using byte which size 1KB at a time.    | 0.657791 sec  |
| Copy a file using byte which size 4KB at a time.    | 0.165079 sec  |
| Copy a file using byte which size 64KB at a time.   | 0.011240 sec  |
| Copy a file by using BefferedReader and PrintWriter | 0.093217 sec  |

In the following table above show that the first task has the slowest run time because copy by byte to byte. But the 4th take using array is the fastest than copy byte to byte or use the BufferedReader. The array size also affect the runtime,when using size array is large then the less run time.
