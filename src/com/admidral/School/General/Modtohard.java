   p   a   c   k   a   g   e       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   G   e   n   e   r   a   l   ;      
      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   R   e   f   e   r   e   n   c   e   .   R   e   f   ;      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   U   t   i   l   .   I   n   p   u   t   ;      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   U   t   i   l   .   T   i   t   l   e   ;      
      
   /   *   *      
       *       C   r   e   a   t   e   d       b   y       p   e   v   i   1   8       o   n       1   1   /   3   0   /   2   0   1   5   .      
       *   /      
   p   u   b   l   i   c       c   l   a   s   s       M   o   d   t   o   h   a   r   d       {      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g   [   ]       a   r   g   s   )       {      
                                   i   n   t       b   a   n   k   c   o   d   e       =       1   0   0   0   0   0   0   ;      
                                   i   n   t       b   k   2   ;      
                                   i   n   t       t   o   t   a   l       =       0   ;      
                                   T   i   t   l   e   .   s   t   a   r   t   i   t   l   e   (   "   B   a   n   k       a   c   c   o   u   n   t       N   u   m   b   e   r       C   h   e   c   k   e   r   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   P   l   e   a   s   e       e   n   t   e   r       y   o   u   r       b   a   n   k       a   c   c   o   u   n   t       n   u   m   b   e   r   "   )   ;      
                                   d   o       {      
                                                   b   a   n   k   c   o   d   e       =       I   n   p   u   t   .   p   o   s   i   t   i   v   e   i   n   t   e   g   e   r   (   )   ;      
                                   }       w   h   i   l   e       (   b   a   n   k   c   o   d   e       >   =       1   0   0   0   0   0   0   )   ;      
                                   S   t   r   i   n   g       R   e   o   r   d   e   r       =       S   t   r   i   n   g   .   f   o   r   m   a   t   (   "   %   0   6   d   "   ,       b   a   n   k   c   o   d   e   )   ;   /   /   t   h   i   s       t   u   r   n   s       i   t       i   n   t   o       a       f   o   u   r       d   i   g   i   t       s   t   r   i   n   g      
                                   t   o   t   a   l       =       t   o   t   a   l       +       (   b   a   n   k   c   o   d   e       /       1   0   0   0   0   0   )       *       6   ;      
                                   b   k   2       =       b   a   n   k   c   o   d   e   ;      
                                   w   h   i   l   e       (   b   k   2       >   =       1   0   0   0   0   0   )       {      
                                                   b   k   2       =       b   k   2       /       1   0   ;      
                                   }      
                                   t   o   t   a   l       =       t   o   t   a   l       +       (   b   k   2       /       1   0   0   0   0   )       *       5   ;      
                                   w   h   i   l   e       (   b   k   2       >   =       1   0   0   0   0   )       {      
                                                   b   k   2       =       b   k   2       /       1   0   ;      
                                   }      
                                   t   o   t   a   l       =       t   o   t   a   l       +       (   b   k   2       /       1   0   0   0   )       *       4   ;      
                                   w   h   i   l   e       (   b   k   2       >   =       1   0   0   0   )       {      
                                                   b   k   2       =       b   k   2       /       1   0   ;      
                                   }      
                                   t   o   t   a   l       =       t   o   t   a   l       +       (   b   k   2       /       1   0   0   )       *       3   ;      
                                   w   h   i   l   e       (   b   k   2       >   =       1   0   0   )       {      
                                                   b   k   2       =       b   k   2       /       1   0   ;      
                                   }      
                                   t   o   t   a   l       =       t   o   t   a   l       +       (   b   k   2       /       1   0   )       *       2   ;      
                                   w   h   i   l   e       (   b   k   2       >   =       1   0   )       {      
                                                   b   k   2       =       b   k   2       /       1   0   ;      
                                   }      
                                   t   o   t   a   l       =       t   o   t   a   l       +       b   k   2       *       1   ;      
                                   i   f       (   t   o   t   a   l       %       1   1       =   =       0   )       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   Y   o   u   r       b   a   n   k       c   o   d   e       w   a   s       "       +       b   a   n   k   c   o   d   e       +       "       a   n   d       i   t       i   s       c   o   r   r   e   c   t   "   )   ;      
                                   }       e   l   s   e       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   Y   o   u   r       b   a   n   k       c   o   d   e       w   a   s       "       +       b   a   n   k   c   o   d   e       +       "       a   n   d       p   l   e   a   s   e       c   h   e   c   k       a   s       y   o   u       e   n   t   e   r   e   d       i   t       w   r   o   n   g   "   )   ;      
                                   }      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   R   e   f   .   E   N   D   I   N   G       +       R   e   f   .   N   A   M   E       +       "       o   n       "       +       "   1   1   /   3   0   /   2   0   1   5   "   )   ;      
      
                   }      
   }