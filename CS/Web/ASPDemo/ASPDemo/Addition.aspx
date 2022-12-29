<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="Addition.aspx.vb" Inherits="ASPDemo.Addition" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <br />
            <br />
            Augend&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TxtAugend" runat="server"></asp:TextBox>
            <br />
            <br />
            Addend&nbsp;&nbsp;
            <asp:TextBox ID="TxtAddend" runat="server"></asp:TextBox>
            <br />
            <br />
            Sum&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TxtSum" runat="server"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="BtnAdd" runat="server" Text="Add" />
&nbsp;</div>
    </form>
</body>
</html>
