   p   a   c   k   a   g   e       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   G   e   n   e   r   a   l   ;      
      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   R   e   f   e   r   e   n   c   e   .   R   e   f   ;      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   U   t   i   l   .   I   n   p   u   t   ;      
      
   /   *   *      
       *       C   r   e   a   t   e   d       b   y       P   o   o   n       o   n       0   8   /   0   2   /   2   0   1   6   .      
       *   /      
   p   u   b   l   i   c       c   l   a   s   s       T   a   s   k   2       {      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       i   n   t       a   r   r   a   y   n   m   b   r       =       5   ;      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g   [   ]       a   r   g   s   )       {      
                                   d   o   u   b   l   e   [   ]       a   r   r   a   y   1       =       n   e   w       d   o   u   b   l   e   [   a   r   r   a   y   n   m   b   r   ]   ;      
                                   b   o   o   l   e   a   n       a       =       t   r   u   e   ;      
                                   f   o   r       (   i   n   t       i       =       0   ;       i       <       a   r   r   a   y   n   m   b   r   ;       i   +   +   )       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   p   l   e   a   s   e       e   n   t   e   r       a       n   e   w       p   o   s   e   t   i   v   e       n   u   m   b   e   r       i   n       b   o   x   "       +       (   i       +       1   )   )   ;      
                                                   a   r   r   a   y   1   [   i   ]       =       I   n   p   u   t   .   p   o   s   i   t   i   v   e   d   e   c   i   m   a   l   (   )   ;      
                                   }      
                                   d   o   u   b   l   e   [   ]       a   r   r   a   y   2       =       n   e   w       d   o   u   b   l   e   [   a   r   r   a   y   n   m   b   r   ]   ;      
                                   i   n   t       c   o   u   n   t   e   r       =       0   ;      
                                   d   o       {      
                                                   a       =       f   a   l   s   e   ;      
                                                   d   o   u   b   l   e       i   s       =       9   9   9   9   9   9   9   9   ;      
                                                   i   n   t       i   s   s       =       0   ;      
                                                   f   o   r       (   i   n   t       i       =       0   ;       i       <       a   r   r   a   y   n   m   b   r   ;       i   +   +   )       {      
                                                                   i   f       (   a   r   r   a   y   1   [   i   ]       >       0   )       {      
                                                                                   a       =       t   r   u   e   ;      
                                                                                   i   f       (   i   s       >       a   r   r   a   y   1   [   i   ]   )       {      
                                                                                                   i   s       =       a   r   r   a   y   1   [   i   ]   ;      
                                                                                                   i   s   s       =       i   ;      
                                                                                   }      
                                                                   }      
      
                                                   }      
                                                   a   r   r   a   y   1   [   i   s   s   ]       =       -   1   ;      
                                                   i   f       (   c   o   u   n   t   e   r       <       5   )       {      
                                                                   a   r   r   a   y   2   [   c   o   u   n   t   e   r   ]       =       i   s   ;      
                                                                   c   o   u   n   t   e   r   +   +   ;      
                                                   }      
                                   }       w   h   i   l   e       (   a       =       t   r   u   e   )   ;      
      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   R   e   f   .   E   N   D   I   N   G       +       R   e   f   .   N   A   M   E       +       "       o   n       "       +       "   0   8   /   0   2   /   2   0   1   6   "   )   ;      
                   }   /   /       e   n   d       o   f       m   a   i   n      
   }   /   /   e   n   d       o   f       c   l   a   s   s      
