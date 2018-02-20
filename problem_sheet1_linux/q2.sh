echo "Enter Destination Filename:";
read dst;
echo "Enter first filename:";
read fst;
echo "Enter second filename:";
read scnd;
cat $fst $scnd >> $dst;
