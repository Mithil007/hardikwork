echo "Enter file or directory name:";read i 	
if [ -f $i ];then
	echo "$i is file."
elif [ -d $i ];then
	echo "$i is directory."
else
	echo "$i is something else."
fi
