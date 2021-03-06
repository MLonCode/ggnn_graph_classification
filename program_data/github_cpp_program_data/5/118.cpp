��/ /   A V L - T r e e . c p p   :   D e f i n e s   t h e   e n t r y   p o i n t   f o r   t h e   c o n s o l e   a p p l i c a t i o n .  
 / /  
  
 # i n c l u d e   " s t d a f x . h "  
 # i n c l u d e   " A V L . h "  
  
 u s i n g   n a m e s p a c e   s t d ;  
  
 v o i d   d i s p l a y M e n u ( ) ;  
 i n t   m a i n ( )  
 {  
 	 T r e e   A V L ;  
 	 A V L . s e t D e b u g ( f a l s e ) ;  
 	 b o o l   a u t o P o p u l a t e   =   t r u e ;  
 	 s t r i n g   i n p u t ;  
 	 c h a r   c h o i c e ;  
  
 	 i f   ( a u t o P o p u l a t e )  
 	 {  
 	 	 A V L . I n s e r t I t e m ( " A n t h o n y " ) ;  
 	 	 A V L . I n s e r t I t e m ( " J a m e s " ) ;  
 	 	 A V L . I n s e r t I t e m ( " R i c h a r d " ) ;  
 	 	 A V L . I n s e r t I t e m ( " P a u l " ) ;  
 	 	 A V L . I n s e r t I t e m ( " L i a m " ) ;  
 	 	 A V L . I n s e r t I t e m ( " J a c k " ) ;  
 	 	 A V L . I n s e r t I t e m ( " A l e x " ) ;  
 	 	 A V L . I n s e r t I t e m ( " M i k e " ) ;  
 	 	 A V L . I n s e r t I t e m ( " O s c a r " ) ;  
 	 	 A V L . I n s e r t I t e m ( " C o l m " ) ;  
 	 	 A V L . I n s e r t I t e m ( " A d a m " ) ;  
 	 	 A V L . I n s e r t I t e m ( " G e r r y " ) ;  
 	 }  
  
 	 d o  
 	 {  
 	 	 d i s p l a y M e n u ( ) ;  
 	 	 c i n   > >   c h o i c e ;  
 	 	 s w i t c h   ( c h o i c e )  
 	 	 {  
 	 	 c a s e   ' 1 ' :  
 	 	 	 d o  
 	 	 	 {  
 	 	 	 	 c o u t   < <   " \ n E n t e r   n a m e   t o   a d d :   ( E n t e r   - 1   t o   e x i t   l o o p ) "   < <   e n d l ;  
 	 	 	 	 c i n   > >   i n p u t ;  
 	 	 	 	 i f   ( i n p u t   ! =   " - 1 " )  
 	 	 	 	 {  
 	 	 	 	 	 c o u t   < <   " I n s e r t i n g   "   < <   i n p u t   < <   e n d l ;  
 	 	 	 	 	 A V L . I n s e r t I t e m ( i n p u t ) ;  
 	 	 	 	 }  
 	 	 	 }   w h i l e   ( i n p u t   ! =   " - 1 " ) ;  
 	 	 	 b r e a k ;  
 	 	 c a s e   ' 2 ' :  
 	 	 	 A V L . P r i n t T r e e ( ) ;  
 	 	 	 b r e a k ;  
 	 	 c a s e   ' 3 ' :  
 	 	 	 c o u t   < <   " \ n \ n E n t e r   t h e   v a l u e   t o   s e a r c h : " ;  
 	 	 	 c i n   > >   i n p u t ;  
 	 	 	 A V L . S e a r c h I t e m ( i n p u t ) ;  
 	 	 	 b r e a k ;  
 	 	 c a s e   ' x ' :  
 	 	 	 s y s t e m ( " e x i t " ) ;  
 	 	 	 b r e a k ;  
 	 	 d e f a u l t :  
 	 	 	 c o u t   < <   " \ n \ n I n v a l i d   c h o i c e ! " ;  
 	 	 	 b r e a k ;  
 	 	 }  
 	 	 s y s t e m ( " p a u s e " ) ;  
 	 }   w h i l e   ( c h o i c e   ! =   ' x ' ) ;  
  
 	 r e t u r n   0 ;  
 }  
 v o i d   d i s p l a y M e n u ( )   {  
 	 s y s t e m ( " c l s " ) ;  
 	 c o u t   < <   " A V L   T R E E " ;  
 	 c o u t   < <   " \ n X )   E X I T " ;  
 	 c o u t   < <   " \ n 1 )   I n s e r t " ;  
 	 c o u t   < <   " \ n 2 )   P r i n t   T r e e " ;  
 	 c o u t   < <   " \ n 3 )   S e a r c h   T r e e " ;  
 }  
  
 