echo -n "Enter No:"
read n
i=0
s=$n
while [ $i -lt $n ]
do
	j=1
	while [ $j -le $s ]
	do
		echo -n " "
		j=$((j+1))
	done
	j=0
	while [ $j -le $i ]
	do
		if [ $j -eq 0 -o $i -eq 0 ];then
			c=1
		else
			c=$((c*(i-j+1)/j))
		fi
		j=$((j+1))
		echo -n "$c"
	done
	i=$((i+1))
	s=$((s-1))
	echo 
done
