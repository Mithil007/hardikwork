echo "Enter login name:"
read a
l=`who`
if [ "$a" -eq "$l" ];then
echo $a
else
echo "Invalid login name."
fi
