result = 0;
puts "input a num"
num1 = gets
puts "input a symbol"
symbol = gets
puts "input another num"
num2 = gets
result = case symbol.chomp # chomp除去输入最后的\t\n
  when "+" then num1.to_i + num2.to_i
  when '-' then num1.to_i - num2.to_i
  when '*' then num1.to_i * num2.to_i
  when '/' then num1.to_i / num2.to_i
end
puts result