package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class atividade implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private com.asia.frete.relatoriodefretev03.pedido pedido_da_atividade;
   private java.util.List<com.asia.frete.relatoriodefretev03.item> item_da_atividade;

   @org.kie.api.definition.type.Label(value = "comentario")
   private java.lang.String comentario;

   public atividade()
   {
   }

   public com.asia.frete.relatoriodefretev03.pedido getPedido_da_atividade()
   {
      return this.pedido_da_atividade;
   }

   public void setPedido_da_atividade(
         com.asia.frete.relatoriodefretev03.pedido pedido_da_atividade)
   {
      this.pedido_da_atividade = pedido_da_atividade;
   }

   public java.util.List<com.asia.frete.relatoriodefretev03.item> getItem_da_atividade()
   {
      return this.item_da_atividade;
   }

   public void setItem_da_atividade(
         java.util.List<com.asia.frete.relatoriodefretev03.item> item_da_atividade)
   {
      this.item_da_atividade = item_da_atividade;
   }

   public java.lang.String getComentario()
   {
      return this.comentario;
   }

   public void setComentario(java.lang.String comentario)
   {
      this.comentario = comentario;
   }

   public atividade(
         com.asia.frete.relatoriodefretev03.pedido pedido_da_atividade,
         java.util.List<com.asia.frete.relatoriodefretev03.item> item_da_atividade,
         java.lang.String comentario)
   {
      this.pedido_da_atividade = pedido_da_atividade;
      this.item_da_atividade = item_da_atividade;
      this.comentario = comentario;
   }

}