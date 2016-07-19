" vim 工作在不兼容模式
set nocp 

" 设置高亮
syntax on

" 设置行号
set nu!
" 设置相对行号
set relativenumber

" 自动缩进
set autoindent
set smartindent

" 统一缩进为4 
set softtabstop=4 
set shiftwidth=4 

" tab 为4个空格
set tabstop=4

" 高亮当前行和列
" set cursorline
" set cursorcolumn

" 括号自动补全
inoremap ( ()<ESC>i
inoremap [ []<ESC>i
inoremap { {}<ESC>i
inoremap < <><ESC>i

" 高亮显示查找结果
set hlsearch

" 增量查找
set incsearch

" 在右下角显示光标位置的状态行
set ruler
