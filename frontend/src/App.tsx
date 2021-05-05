import DataTable from 'componentes/dataTable';
import Footer from 'componentes/footer';
import Navbar from 'componentes/navbar';
import React from 'react';


function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">Demo desenvolvida para integrar Spring/React </h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
