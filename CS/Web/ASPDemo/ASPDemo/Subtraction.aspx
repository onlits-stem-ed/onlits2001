<%@ Page Title="" Language="vb" AutoEventWireup="false" MasterPageFile="~/Site.Master" CodeBehind="Subtraction.aspx.vb" Inherits="ASPDemo.Subtraction" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <p>
    <br />
    Subtrahand&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TxtSubtrahand" runat="server"></asp:TextBox>
            <br />
            <br />
            Minuend&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
            <asp:TextBox ID="TxtMinuend" runat="server" Width="127px"></asp:TextBox>
            <br />
            <br />
            Difference&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TxtDiffernce" runat="server" Width="123px"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="BtnSubtract" runat="server" Text="Subtract" />
&nbsp;</p>
<p>
</p>
<p>
</p>
<p>
</p>
</asp:Content>
