   p   a   c   k   a   g   e       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   G   e   n   e   r   a   l   ;      
      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   R   e   f   e   r   e   n   c   e   .   R   e   f   ;      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   U   t   i   l   .   I   n   p   u   t   ;      
   i   m   p   o   r   t       c   o   m   .   a   d   m   i   d   r   a   l   .   S   c   h   o   o   l   .   U   t   i   l   .   T   i   t   l   e   ;      
      
      
   /   *   *      
       *       C   r   e   a   t   e   d       b   y       p   e   v   i   1   8       o   n       1   1   /   2   4   /   2   0   1   5   .      
       *   /      
   p   u   b   l   i   c       c   l   a   s   s       H   a   r   d       {      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g   [   ]       a   r   g   s   )       {      
      
                                   b   o   o   l   e   a   n       c   h   e   c   k       =       t   r   u   e   ,       c   h   e   c   k   2       =       t   r   u   e   ,       c   h   e   c   k   3       =       t   r   u   e   ,       c   h   e   c   k   4       =       t   r   u   e   ;      
                                   i   n   t       s   t   o   c   k   1       =       1   0   0   0   0   ,       r   e   o   r   d   e   r   1       =       1   0   0   0   0   ;      
                                   S   t   r   i   n   g       I   t   e   m   C   o   d   e   ;      
                                   T   i   t   l   e   .   s   t   a   r   t   i   t   l   e   (   "   P   l   e   a   s   e       E   n   t   e   r   -   "   )   ;   /   /       t   h   i   s       i   s       t   h   e       t   i   t   l   e      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   I   t   e   m       C   o   d   e   :       "   )   ;      
                                   d   o       {      
      
      
                                                   d   o       {      
                                                                   c   h   e   c   k       =       t   r   u   e   ;      
                                                                   d   o       {      
                                                                                   I   t   e   m   C   o   d   e       =       I   n   p   u   t   .   w   o   r   d   s   (   )   ;      
                                                                   }       w   h   i   l   e       (   I   t   e   m   C   o   d   e   .   l   e   n   g   t   h   (   )       !   =       4   )   ;   /   /       t   h   i   s       m   a   k   e   s       s   u   r   e       t   h   a   t       t   h   e       i   n   p   u   t       i   s       4       i   n       l   e   n   g   t   h      
                                                                   S   t   r   i   n   g       t   e   s   t       =       I   t   e   m   C   o   d   e   .   s   u   b   s   t   r   i   n   g   (   2   ,       4   )   ;      
                                                                   t   r   y       {      
                                                                                   I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   t   e   s   t   )   ;      
                                                                   }       c   a   t   c   h       (   N   u   m   b   e   r   F   o   r   m   a   t   E   x   c   e   p   t   i   o   n       e   )       {      
                                                                                   c   h   e   c   k       =       f   a   l   s   e   ;      
                                                                   }      
                                                   }       w   h   i   l   e       (   c   h   e   c   k       =   =       f   a   l   s   e   )   ;   /   /       T   h   i   s       c   h   e   c   k   s       t   h   a   t       d   i   g   i   t       3       a   n   d       4       a   r   e       n   u   m   b   e   r   s      
                                                   c   h   e   c   k   2       =       t   r   u   e   ;      
                                                   c   h   e   c   k   3       =       t   r   u   e   ;      
                                                   c   h   e   c   k   4       =       t   r   u   e   ;      
                                                   S   t   r   i   n   g       t   e   s   t   2       =       I   t   e   m   C   o   d   e   .   s   u   b   s   t   r   i   n   g   (   0   ,       1   )   ;      
                                                   t   r   y       {      
                                                                   I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   t   e   s   t   2   )   ;      
                                                   }       c   a   t   c   h       (   N   u   m   b   e   r   F   o   r   m   a   t   E   x   c   e   p   t   i   o   n       e   )       {      
                                                                   c   h   e   c   k   3       =       f   a   l   s   e   ;      
                                                   }   /   /       t   h   i   s       c   h   e   c   k   s       t   h   e       f   i   r   s   t       c   h   a   r   a   c   t   e   r       i   s       n   o   t       a       n   u   m   b   e   r      
                                                   S   t   r   i   n   g       t   e   s   t   3       =       I   t   e   m   C   o   d   e   .   s   u   b   s   t   r   i   n   g   (   1   ,       2   )   ;      
                                                   t   r   y       {      
                                                                   I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   t   e   s   t   3   )   ;      
                                                   }       c   a   t   c   h       (   N   u   m   b   e   r   F   o   r   m   a   t   E   x   c   e   p   t   i   o   n       e   )       {      
                                                                   c   h   e   c   k   2       =       f   a   l   s   e   ;      
                                                   }   /   /       t   h   i   s       c   h   e   c   k   s       t   h   e       s   e   c   o   u   n   d       c   h   a   r   a   c   t   e   r       i   s       n   o   t       a       n   u   m   b   e   r      
                                                   i   f       (   c   h   e   c   k   2       =   =       f   a   l   s   e       &   &       c   h   e   c   k   3       =   =       f   a   l   s   e   )       {      
                                                                   c   h   e   c   k   4       =       f   a   l   s   e   ;      
                                                   }   /   /       t   h   i   s       m   a   k   e   s       s   u   r   e       t   h   e       c   h   e   c   k       i   s       i   n   d   u   v   i   d   u   a   l   l   y      
      
                                   }       w   h   i   l   e       (   c   h   e   c   k   4       =   =       t   r   u   e   )   ;   /   /       t   h   i   s       m   a   k   e   s       s   u   r   e       t   h   a   t       b   o   t   h       t   h   e       f   i   r   s   t       t   w   o       a   r   e       c   h   a   r   a   c   t   e   r   s      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   P   r   o   d   u   c   t       D   e   s   c   r   i   p   t   i   o   n   :       "   )   ;      
                                   S   t   r   i   n   g       D   e   s   c   r   i   p   t   i   o   n       =       I   n   p   u   t   .   w   o   r   d   s   (   )   ;      
      
                                   S   t   r   i   n   g       D   e   s   c   r   i   p   t   i   o   n   2       =       S   t   r   i   n   g   .   f   o   r   m   a   t   (   "   %   -   1   2   s   "   ,       D   e   s   c   r   i   p   t   i   o   n   )   ;   /   /       t   h   i   s       a   d   d   s       i   t       u   p       t   o       1   2       l   e   t   t   e   r   s       w   i   t   h       s   p   a   c   e   s       i   f       t   h   e   r   e       i   s       l   e   s   s       t   h   a   n       1   2      
                                   D   e   s   c   r   i   p   t   i   o   n       =       D   e   s   c   r   i   p   t   i   o   n   2   .   s   u   b   s   t   r   i   n   g   (   0   ,       1   2   )   ;   /   /       t   h   i   s       t   a   k   e   s       t   h   e       f   i   r   s   t       1   2       l   e   t   t   e   r   s       i   n       c   a   s   e       t   h   e   r   e       i   s       m   o   r   e       t   h   a   n       1   2      
      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   S   t   o   c   k       L   e   v   e   l   :       "   )   ;      
                                   w   h   i   l   e       (   s   t   o   c   k   1       >   =       1   0   0   0   0   )       {      
                                                   s   t   o   c   k   1       =       I   n   p   u   t   .   p   o   s   i   t   i   v   e   i   n   t   e   g   e   r   (   )   ;      
                                   }   /   /       t   h   i   s       m   a   k   e   s       s   u   r   e       t   h   e       s   t   o   c   k       l   e   v   e   l       i   s       l   e   s   s       t   h   a   n       1   0   0   0   0       s   o       i   t       i   s       w   i   t   h   i   n       f   o   u   r       d   i   g   i   t   s      
                                   S   t   r   i   n   g       S   t   o   c   k       =       S   t   r   i   n   g   .   f   o   r   m   a   t   (   "   %   0   4   d   "   ,       s   t   o   c   k   1   )   ;   /   /       t   h   i   s       t   u   r   n   s       i   t       i   n   t   o       a       f   o   u   r       d   i   g   i   t       s   t   r   i   n   g      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   R   e   o   r   d   e   r       L   e   v   e   l   :       "   )   ;      
                                   w   h   i   l   e       (   r   e   o   r   d   e   r   1       >   =       1   0   0   0   0   )       {      
                                                   r   e   o   r   d   e   r   1       =       I   n   p   u   t   .   p   o   s   i   t   i   v   e   i   n   t   e   g   e   r   (   )   ;      
                                   }   /   /       t   h   i   s       m   a   k   e   s       s   u   r   e       t   h   e       r   e   o   r   d   e   r       l   e   v   e   l       i   s       l   e   s   s       t   h   a   n       1   0   0   0   0       s   o       i   t       i   s       w   i   t   h   i   n       f   o   u   r       d   i   g   i   t   s      
                                   S   t   r   i   n   g       R   e   o   r   d   e   r       =       S   t   r   i   n   g   .   f   o   r   m   a   t   (   "   %   0   4   d   "   ,       r   e   o   r   d   e   r   1   )   ;   /   /       t   h   i   s       t   u   r   n   s       i   t       i   n   t   o       a       f   o   u   r       d   i   g   i   t       s   t   r   i   n   g      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   S   u   p   p   l   i   e   r       N   a   m   e   "   )   ;      
                                   S   t   r   i   n   g       S   u   p   p   l   i   e   r   n   a   m   e       =       "   "   ;      
                                   d   o       {      
                                                   S   u   p   p   l   i   e   r   n   a   m   e       =       I   n   p   u   t   .   w   o   r   d   s   (   )   ;      
                                   }       w   h   i   l   e       (   S   u   p   p   l   i   e   r   n   a   m   e   .   l   e   n   g   t   h   (   )       <   =       2   )   ;      
                                   S   t   r   i   n   g       S   u   p   p   l   i   e   r       =       "   "   ;      
                                   f   o   r       (   S   t   r   i   n   g       S   u   p   p   l   i   e   r   w   o   r   d   s       :       S   u   p   p   l   i   e   r   n   a   m   e   .   s   p   l   i   t   (   "       "   ,       2   )   )       {      
                                                   S   u   p   p   l   i   e   r       +   =       S   u   p   p   l   i   e   r   w   o   r   d   s   .   c   h   a   r   A   t   (   0   )   ;      
                                   }   /   /   T   h   i   s       s   p   l   i   t   s       t   h   e       f   i   r   s   t       t   w   o       w   o   r   d   s       a   n   d       a   d   d   s       t   h   e       f   i   r   s   t       l   e   t   t   e   r       t   o       t   h   e       C   o   d   e      
                                   i   f       (   S   u   p   p   l   i   e   r   .   l   e   n   g   t   h   (   )       <       2   )       {      
                                                   S   u   p   p   l   i   e   r       +   =       S   u   p   p   l   i   e   r   n   a   m   e   .   c   h   a   r   A   t   (   1   )   ;      
                                   }   /   /   t   h   i   s       i   s       b   a   c   k   u   p       i   n       c   a   s   e       t   h   e       s   u   p   p   l   i   e   r       n   a   m   e       i   s       o   n   e       w   o   r   d       s   o       i   t       s   t   i   l   l       h   a   s       t   w   o       b   y       t   a   k   i   n   g       t   h   e       s   e   c   o   u   n   d       c   h   a   r   a   c   t   e   r      
      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   Y   o   u   r       R   e   c   o   r   d       C   o   d   e       i   s       -   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   I   t   e   m   C   o   d   e       +       D   e   s   c   r   i   p   t   i   o   n       +       S   t   o   c   k       +       R   e   o   r   d   e   r       +       S   u   p   p   l   i   e   r   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   "   )   ;      
                                   i   f       (   r   e   o   r   d   e   r   1       >   =       s   t   o   c   k   1   )       {      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   W   a   r   n   i   n   g   :       Y   o   u       m   u   s   t       R   e   o   r   d   e   r       t   o   d   a   y   .   "   )   ;      
                                   }   /   /       i   f       t   h   e       r   e   o   r   d   e   r       i   s       s   a   m   e       o   r       l   a   r   g   e   r       t   h   a   n       s   t   o   c   k       t   e   l   l       i   t       t   o       r   e   o   r   d   e   r      
      
      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   "   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   R   e   f   .   E   N   D   I   N   G       +       R   e   f   .   N   A   M   E       +       "       o   n       "       +       "   1   1       /       2   4       /       2   0   1   5   "   )   ;      
                   }   /   /   e   n   d       o   f       m   a   i   n      
      
   }   /   /   e   n   d       o   f       p   r   o   g   r   a   m      
