   p   a   c   k   a   g   e       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   R   a   n   d   o   m   _   S   t   u   f   f   ;      
      
   i   m   p   o   r   t       j   a   v   a   .   u   t   i   l   .   S   c   a   n   n   e   r   ;      
      
   /   *   *      
       *       C   r   e   a   t   e   d       b   y       P   o   o   n       o   n       0   8   /   0   2   /   2   0   1   6   .      
       *   /      
   p   u   b   l   i   c       c   l   a   s   s       a   r   r   a   y   1       {      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       f   i   n   a   l       i   n   t       A   R   R   A   Y   _   S   I   Z   E       =       5   ;      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g       a   r   g   s   [   ]   )       {      
                                   /   /   F   i   r   s   t   ,       s   e   t       u   p       a       c   o   l   l   e   c   t   i   o   n       o   f       4       v   a   r   i   a   b   l   e   s      
                                   i   n   t   [   ]       h   o   w   H   a   n   d   s   o   m   e       =       n   e   w       i   n   t   [   A   R   R   A   Y   _   S   I   Z   E   ]   ;      
                                   i   n   t       t   o   t   a   l       =       0   ;      
      
                                   /   /       G   e   t       r   e   a   d   y       t   o       r   e   a   d       i   n       a       u   s   e   r   s       c   h   o   i   c   e      
                                   S   c   a   n   n   e   r       u   s   e   r   i   n   p   u   t       =       n   e   w       S   c   a   n   n   e   r   (   S   y   s   t   e   m   .   i   n   )   ;      
      
                                   /   /       I   n   i   t   i   a   l   i   s   e       a   l   l       a   r   r   a   y       e   l   e   m   e   n   t   s      
                                   f   o   r       (   i   n   t       i   n   d   e   x       =       0   ;       i   n   d   e   x       <       A   R   R   A   Y   _   S   I   Z   E   ;       i   n   d   e   x   +   +   )       {      
                                                   h   o   w   H   a   n   d   s   o   m   e   [   i   n   d   e   x   ]       =       0   ;      
                                   }       /   /   f   o   r      
      
                                   /   /       I   n   p   u   t       c   o   n   t   e   n   t   s       o   f       a   r   r   a   y      
                                   f   o   r       (   i   n   t       i   n   d   e   x       =       0   ;       i   n   d   e   x       <       A   R   R   A   Y   _   S   I   Z   E   ;       i   n   d   e   x   +   +   )       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   (   "   P   l   e   a   s   e       e   n   t   e   r       b   o   x       "       +       i   n   d   e   x       +       "   :       "   )   ;      
                                                   h   o   w   H   a   n   d   s   o   m   e   [   i   n   d   e   x   ]       =       u   s   e   r   i   n   p   u   t   .   n   e   x   t   I   n   t   (   )   ;      
                                   }       /   /   f   o   r      
      
                                   /   /       S   e   t       a       s   p   e   c   i   f   i   c       l   o   c   a   t   i   o   n       t   o       a       v   a   l   u   e      
                                   h   o   w   H   a   n   d   s   o   m   e   [   2   ]       =       9   9   ;           /   /       A   s   s   u   m   e       A   R   R   A   Y   _   S   I   Z   E       >   =       3      
      
                                   /   /       D   i   s   p   l   a   y       a   n       a   r   r   a   y       l   o   c   a   t   i   o   n      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   h   o   w   H   a   n   d   s   o   m   e   [   2   ]       =       "       +       h   o   w   H   a   n   d   s   o   m   e   [   2   ]   )   ;      
      
                                   /   /       D   i   s   p   l   a   y       c   o   n   t   e   n   t   s       o   f       a   r   r   a   y      
                                   f   o   r       (   i   n   t       i   n   d   e   x       =       0   ;       i   n   d   e   x       <       A   R   R   A   Y   _   S   I   Z   E   ;       i   n   d   e   x   +   +   )       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   L   o   c   a   t   i   o   n       c   o   n   t   e   n   t   s       =       "       +       h   o   w   H   a   n   d   s   o   m   e   [   i   n   d   e   x   ]   )   ;      
                                   }       /   /   f   o   r      
      
                                   /   /   A   d   d       t   h   e       a   r   r   a   y       n   u   m   b   e   r   s       t   o       g   e   t       t   h   e       t   o   t   a   l      
                                   f   o   r       (   i   n   t       i   n   d   e   x       =       0   ;       i   n   d   e   x       <       A   R   R   A   Y   _   S   I   Z   E   ;       i   n   d   e   x   +   +   )       {      
                                                   t   o   t   a   l       =       t   o   t   a   l       +       h   o   w   H   a   n   d   s   o   m   e   [   i   n   d   e   x   ]   ;      
                                   }       /   /   f   o   r      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   T   o   t   a   l       =       "       +       t   o   t   a   l   )   ;      
      
                                   /   /       T   a   s   k       1   :       W   r   i   t   e       c   o   d   e       t   o       s   e   a   r   c   h       f   o   r       a       g   i   v   e   n       v   a   l   u   e       i   n       t   h   e       a   r   r   a   y      
                                   /   /       i   f       f   o   u   n   d   ,       r   e   t   u   r   n       t   h   e       l   o   c   a   t   i   o   n   ,       e   l   s   e       r   e   t   u   r   n       -   1      
      
                                   /   /       T   a   s   k       2   :       C   r   e   a   t   e       t   w   o       n   e   w       a   r   r   a   y   s       c   a   l   l   e   d       u   n   s   o   r   t   e   d       a   n   d       s   o   r   t   e   d   .       I   n       t   h   e      
                                   /   /       u   n   s   o   r   t   e   d       a   r   r   a   y       p   l   a   c   e       u   s   e   r       i   n   p   u   t       r   a   n   d   o   m       i   n   t   e   g   e   r   s   .       W   r   i   t   e       c   o   d   e       t   o       t   a   k   e      
                                   /   /       t   h   e       c   o   n   t   e   n   t   s       o   f       t   h   e       u   n   s   o   r   t   e   d       a   r   r   a   y       a   n   d       t   o       s   t   o   r   e       i   t       i   n       t   h   e       s   o   r   t   e   d       a   r   r   a   y      
                                   /   /       i   n       a   s   c   e   n   d   i   n   g       o   r   d   e   r   .       E   .   g   .   :      
                                   /   /       u   n   s   o   r   t   e   d       =       [   3   ,       7   ,       2   ,       9   ,       1   ]      
                                   /   /       s   o   r   t   e   d       =       [   1   ,       2   ,       3   ,       7   ,       9   ]                       -       a   f   t   e   r       y   o   u   r       p   r   o   g   r   a   m       h   a   s       r   u   n   .      
      
                   }       /   /       m   a   i   n      
   }      
