#!/bin/bash
read -p "please input your name : " name
echo $name
read -p "please input your age : " -t 5 age
echo $age
read -p "please input your passwd : " -s passwd
echo -e "\n"
echo $passwd
read -p "please input your sex[M/F] : " -n 1 sex
echo -e "\n"
echo $sex
